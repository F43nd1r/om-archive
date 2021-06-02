
solution {
    puzzle = "P017"
    name = "NEW SOLUTION 4"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -1
        rotation = -4
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
