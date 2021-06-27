
solution {
    puzzle = "P007"
    name = "NEW SOLUTION 2 (Copy)"
    arm(ARM6) {
        number = 1
        position = 2 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    track {
        position = 5 to -2
        positions = listOf(-1 to 2, -2 to 2, -3 to 2, -4 to 2, -4 to 3, -3 to 3, -2 to 3, -1 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
            }
        }
        )
    }
}
