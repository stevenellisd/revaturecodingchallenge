mod permutations;

/*fn main() {
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
*/

use std::io;

macro_rules! parse_input {
    ($x:expr, $t:ident) => ($x.trim().parse::<$t>().unwrap())
}

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
 fn main() {

    // game loop
    loop {
        let mut mountains = Vec::new();

        for i in 0..8 as usize {
            let mut input_line = String::new();
            io::stdin().read_line(&mut input_line).unwrap();
            let mountain_h = parse_input!(input_line, i32); // represents the height of one mountain.
            mountains.push(mountain_h);
        }
        let mut max_index = 0;
        let mut max_h = 1;
        while max_h > 0 {
            let mut i = 0;
            for height in mountains.clone() {
                if height > max_h {
                    max_h = height;
                    max_index = i;
                }
                i = i + 1;
            }

            if max_h > 0 {
                println!("{}", max_index);
                max_h = max_h - 1;
                mountains[max_index] = max_h;
            }
        }
    }
}