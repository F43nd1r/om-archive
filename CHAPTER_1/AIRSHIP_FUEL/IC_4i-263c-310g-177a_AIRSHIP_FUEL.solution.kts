
solution {
    puzzle = "P008"
    name = "3I 5"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 1
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(0 to -2, -1 to -2, 0 to -3, 0 to -4, 0 to -5, -1 to -4, -1 to -3, -2 to -2, -2 to -3, -2 to -4, -2 to -5, -3 to -4, -3 to -5, -4 to -5, -4 to -4, -5 to -3, -5 to -4, -6 to -3, -7 to -3, -8 to -2, -8 to -1, -7 to -2, -6 to -2, -7 to -1, -8 to 0, -8 to 1, -7 to 1, -8 to 2, -7 to 2, -8 to 3, -7 to 3, -7 to 4, -6 to 3, -6 to 2, -5 to 2, -4 to 1, -4 to 2, -5 to 3, -4 to 3, -5 to 4, -4 to 4, -3 to 3, -3 to 2, -3 to 1, -2 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
