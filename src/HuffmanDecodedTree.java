import java.util.ArrayList;
import java.util.HashMap;

public class HuffmanDecodedTree {
	HuffmanNode root = new HuffmanNode(1, 'Ë');

	public void build(String character, String code) {
		HuffmanNode nodePointer = root;
		for (int i = 0; i < code.length() - 1; i++) {
			if (code.charAt(i) == '0') {
				if (nodePointer.getLeft() == null) {
					HuffmanNode left = new HuffmanNode(1, 'Ë');
					nodePointer.setLeft(left);
				}
				nodePointer = nodePointer.getLeft();
			} else {
				if (nodePointer.getRight() == null) {
					HuffmanNode right = new HuffmanNode(1, 'Ë');
					nodePointer.setRight(right);
				}
				nodePointer = nodePointer.getRight();
			}
		}

		if (code.charAt(code.length() - 1) == '1') {
			HuffmanNode right = new HuffmanNode(1, character.charAt(0));
			nodePointer.setRight(right);
		} else {
			HuffmanNode left = new HuffmanNode(1, character.charAt(0));
			nodePointer.setLeft(left);
		}

	}

	public void decodeFile(String compressedLine) {
		String binaryCompressedString = convertStringToBinary(compressedLine);
		HuffmanNode nodePointer = root;
		for (int i = 0; i < binaryCompressedString.length(); i++) {
			if(binaryCompressedString.charAt(i) == '0'){
				nodePointer = nodePointer.getLeft();
				if(nodePointer.getLeft() == null && nodePointer.getRight() == null){
					System.out.println(nodePointer.getCharacter());
					nodePointer = root;
				}
			}
			else if(binaryCompressedString.charAt(i) == '1'){
				nodePointer = nodePointer.getRight();
				if(nodePointer.getLeft() == null && nodePointer.getRight() == null){
					System.out.println(nodePointer.getCharacter());
					nodePointer = root;
				}
			}
		}

	}

	private String convertStringToBinary(String compressedLine) {
		String binaryCompressedString = "";
		for(int i = 0; i < compressedLine.length() - 1; i++){
			System.out.println(Integer.toBinaryString(compressedLine.charAt(i)));
			binaryCompressedString += String.format("%08d",Integer.parseInt(Integer.toBinaryString(compressedLine.charAt(i))));
		}
		binaryCompressedString +=Integer.toBinaryString(compressedLine.charAt(compressedLine.length() - 1));
		return binaryCompressedString;
		
	}

}
