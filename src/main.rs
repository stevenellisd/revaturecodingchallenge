mod permutations;

fn main() {
    /*

    Given array of distinct integers, print all permutations of the array.
    For example :
    array : [10, 20, 30]

    Permutations are :

    [10, 20, 30]
    [10, 30, 20]
    [20, 10, 30]
    [20, 30, 10]
    [30, 10, 20]
    [30, 20, 10] 

    */
    let vec = vec![1, 2, 3];
    let result = permutations::permutations(vec);
    for v in result {
        permutations::print_vec(&v);
    }
}
