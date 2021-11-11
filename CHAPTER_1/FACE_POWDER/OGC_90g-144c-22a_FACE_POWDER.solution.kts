
solution {
    puzzle = "P009"
    name = "NEW SOLUTION 15"
    arm(ARM6) {
        number = 1
        position = -11 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -7 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -9 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to -6
        rotation = 3
    }
    track {
        position = -8 to -5
        positions = listOf(-3 to 1, -2 to 1, -1 to 1, 0 to 1, 0 to 0, -1 to 0, -2 to 0, -3 to 0)
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
