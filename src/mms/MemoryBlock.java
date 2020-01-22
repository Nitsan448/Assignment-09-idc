package mms;
/**
 * Represents a block of memory.
 * Each memory block has a base address, and a length in words. 
 */
public class MemoryBlock {

	/** the base address of this memory block */
	int baseAddress;
	/** the length of this memory block, in words */
	int length;

	/**
	 * Constructs a new memory block with a given base address and a given length in words 
	 * 
	 * @param baseAddress
	 *        the memory address of the first word in this block
	 * @param length
	 *        the length of this memory block, in words
	 */
	public MemoryBlock(int baseAddress, int length) {
		// replace this comment with your code
	}

	/**
	 * Checks if this block has the same base address and length as the given block
	 * 
	 * @param other
	 *        the given block
	 * @return true if this block equals the other block, false otherwise
	 */
	public boolean equals(MemoryBlock other) {
		// replace this comment with your code
		return false;
	}

	/**
	 * A textual representation of this block, useful for debugging.
	 * The block's contents should appear within "(" and ")".
	 * (See the test output for examples).
	 */
	public String toString() {
		// replace this comment with your code
		return null;
	}
	
}