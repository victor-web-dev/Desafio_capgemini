function questao1(n) {
  let a = "";
  for(let i = 0;i < n; i++){
    let emptySpace = ""
    a += "*";
    for(let j = n - i; j > 0; j--) {
      emptySpace += " ";
    }
    console.log(emptySpace + a);
  }
}



function handleValidation(password) {
  const size = password.length;
  const minSize = 6;
  if(size < minSize) return  console.log(minSize - size);
}

function questao2(password) {
  const regex = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%^&*()-+]).{6,}$/;
  // se o texto nao corresponder corretamente, retorna -1
  const validation = password.search(regex);
  if (validation === -1 && password.length < 6) {
    // vai retornar a contagem de caracteres necessarias para o tamanho minimo de senha.
    handleValidation(password);
  } else {
    return console.log(validation);
    // retorna 0 se a senha estiver no padrao correto
    // retorna -1 se a senha for maior que 6 mas nao corresponder ao padrao correto
  }
  
}



function questao3(text) {
  let anagram = text.split('');
  const array = [];
  console.log(anagram); 

  for(let i = 0; i < anagram.length; i++) {
    for( let j = i+1; j < anagram.length; j++) {
      if(anagram[i] === anagram[j]) {
        array.push([anagram[i],anagram[j]]);
      }
    }
  }
console.log(array);
}

// questao1(6);
// questao2("Ya3af");
// questao3("ifailuhkqq")