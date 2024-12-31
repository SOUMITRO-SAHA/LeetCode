/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    const lower = sentence.toLowerCase();

    for(let i = 97; i <= 122; i++){
        if(!lower.includes(String.fromCharCode(i))) return false;
    }

    return true;
};