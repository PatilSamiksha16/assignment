function reverseWords(sentence) {
  // Split the sentence into words
  let words = sentence.split(' ');

  // Reverse each word and store in a new array
  let reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });

  // Join the reversed words back into a sentence
  let reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

// Example usage:
const inputSentence = "This is a sunny day";
const reversed = reverseWords(inputSentence);
console.log(reversed);