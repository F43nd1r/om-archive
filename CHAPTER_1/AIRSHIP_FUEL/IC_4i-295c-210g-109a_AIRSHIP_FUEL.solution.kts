
solution {
    puzzle = "P008"
    name = "NEW SOLUTION 11"
    arm(ARM6) {
        number = 1
        position = -5 to -6
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -12 to -3
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -10 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -11 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -12 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -10 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to -3
        rotation = 0
    }
    track {
        position = -6 to -6
        positions = listOf(1 to -1, 1 to -2, 1 to -3, 0 to -2, -1 to -2, -2 to -2, -2 to -3, -3 to -2, -4 to -2, -5 to -1, -5 to 0, -4 to -1, -4 to 0, -3 to -1, -3 to 0, -2 to -1, -1 to -1, 0 to -1, -1 to 0, -2 to 1, -2 to 2, -1 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                back()
            }
        }
        )
    }
}
