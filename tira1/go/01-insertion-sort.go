package main

import (
	"strconv"
)

func insertionSort(arr []int) {
	for i := 0; i < len(arr); i++ {

		// while loops not available in Go the rest of the conditions should be inside the loop.
		for j := i - 1; j >= 0; {
			if arr[j] > arr[j+1] {
				tmp := arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = tmp
				j--
			} else {
				break
			}

		}

	}

}

func printArray(arr []int) {
	var msg = ""
	for i := 0; i < len(arr); i++ {
		msg = msg + strconv.Itoa(arr[i]) + ", "
	}
	print(msg)
}

func main() {
	nums := []int{5, 2, 4, 2, 6, 1}
	printArray(nums)
	print("\n")
	insertionSort(nums)
	printArray(nums)

}
