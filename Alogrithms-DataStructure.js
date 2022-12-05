let array = [
  [6, 8],
  [2, 4],
  [7, 1],
  [9, 2],
  [5, 7],
];
const swap = (array = [], i = 0, j = 1) => {
  [array[i], array[j]] = [array[j], array[i]];
};

const heapify = (arr, n, i) => {
  let largest = i;
  let l = 2 * i + 1;
  let r = 2 * i + 2;

  if (l < n && arr[largest][0] * arr[largest][1] < arr[l][0] * arr[l][1]) {
    largest = l;
  }

  if (r < n && arr[largest][0] * arr[largest][1] < arr[r][0] * arr[r][1]) {
    largest = r;
  }

  if (largest === i) return;

  swap(arr, i, largest);
  heapify(arr, n, largest);
};

const buildMaxHeap = array => {
  for (let i = Math.floor(array.length / 2) - 1; i >= 0; i--) {
    heapify(array, array.length, i);
  }
  return array;
};

const heapSort = array => {
  buildMaxHeap(array);
  for (let i = array.length - 1; i > 0; i--) {
    swap(array, i, 0);
    heapify(array, i, 0);
  }
  return array;
};

heapSort(array);

console.log(array);
