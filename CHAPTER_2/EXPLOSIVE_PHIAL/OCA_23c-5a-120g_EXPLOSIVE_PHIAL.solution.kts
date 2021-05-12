
solution {
    puzzle = "P017"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -1
        rotation = -4
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
