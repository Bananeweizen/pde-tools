package net.jeeeyul.pdetools.clipboard

import net.jeeeyul.pdetools.clipboard.model.clipboard.ClipboardFactory

import static extension net.jeeeyul.pdetools.clipboard.ClipboardService.*

class ClipboardService extends AbstractClipboardService {
	extension ClipboardFactory = ClipboardFactory::eINSTANCE
	
	static ClipboardService INSTANCE;
	
	def static initailze(){
		if(INSTANCE == null){
			INSTANCE = new ClipboardService()
		}
	}
	
	def static getInstance(){
		if(INSTANCE == null){
			// FIXME ���� ��ũ��ġ�� ���� ���� ���� ���� ��� ������ �߻� �� �� ����.
			initailze()
		}
		return INSTANCE
	}
	
	private new(){
	}
	
	override protected handleCopy() {
		var hasTextContents = nativeClipboard.availableTypes.exists[textTransfer.isSupportedType(it)]
		if(!hasTextContents){
			return;
		}
		
		var entry = createClipboardEntry() => [
			it.textContent = nativeClipboard.getContents(textTransfer) as String
			
			if(nativeClipboard.availableTypes.exists[RTFTransfer.isSupportedType(it)]){
				it.rtfContent = nativeClipboard.getContents(RTFTransfer) as String
			}
		]
		
		history.entries.add(0, entry)
	}
	
}