function solution(new_id) {
    let answer = new_id
        .toLowerCase() //1단계
        .replace(/[^\w-_\.]/g,'') //2단게
        .replace(/\.+/g,'.') //3단계
        .replace(/^\.|\.$/g,'') //4단계
        .replace(/^$/,'a') //5단계
        .slice(0,15).replace(/\.$/,''); //6단계
    
    return answer.padEnd(3,answer[answer.length-1]); //7단계
}