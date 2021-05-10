
solution {
    puzzle = "P017"
    name = "INSTRUCTIONS 8"
    arm(ARM6) {
        number = 1
        position = -8 to 2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -5 to 2
        rotation = -5
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to 2
        rotation = -6
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 3
        rotation = -7
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = -8 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 1 to -2, 2 to -2, 2 to -1, 3 to -2, 4 to -2, 3 to -1, 4 to -1, 5 to -2, 6 to -2, 5 to -1, 6 to -1, 7 to -2, 8 to -3, 9 to -4, 10 to -4, 10 to -5, 9 to -5, 8 to -4, 7 to -3, 6 to -3, 5 to -3, 4 to -3, 3 to -3, 2 to -3, 1 to -3, 0 to -2, 0 to -1)
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
