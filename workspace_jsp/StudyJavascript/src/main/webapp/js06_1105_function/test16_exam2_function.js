/**
 * 
 */
function printArray (arr) {
	// 배열의 모든 요소를 우측으로 출력
	for (let i = 0; i < arr.length; i++) {
		document.write(arr[i] + " ");
	}
	document.write("<br>");
}
	
function rotation (arr) {
	// 배열안에 데이터를 옮기는 작업 (한바퀴 돌리기)
	let temp = arr[0];
	for (let i = 0; i < arr.length - 1; i++) {
		arr[i] = arr[i+1];
	}
 	arr[arr.length - 1] = temp;
}