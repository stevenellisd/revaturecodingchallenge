pub(crate) fn permutations(input: Vec<i32>) -> Vec<Vec<i32>> {
    if input.len() == 0 {
        return vec![vec![]];
    } else if input.len() == 1 {
        return vec![input];
    } else {
        let mut perm: Vec<Vec<i32>> = vec![];
        for i in 0 .. input.len() {
            let n = vec![input[i]];
            let remaining = [&input[..i], &input[i+1..]].concat();
            for mut p in permutations(remaining) {
                let mut q: Vec<i32> = n.clone();
                q.append(&mut p);
                if q.len() == input.len() {
                    perm.insert(perm.len(), q);
                }
            }
        }
        return perm;
    }
}

pub(crate) fn print_vec(input: &Vec<i32>) {
    print!("[");
    for i in 0 .. input.len() {
        print!("{}", input[i]);
        if i != input.len() - 1 {
            print!(", ");
        }
    }
    println!("]");
}