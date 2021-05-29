
solution {
    puzzle = "w2450508212"
    name = "I"
    arm(ARM6) {
        number = 1
        position = -1 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 4 to 1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to 2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 1
        rotation = 3
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1, 3 to 0, 4 to -1, 5 to -2, 4 to -2, 4 to -3, 4 to -4, 3 to -4, 3 to -5, 2 to -5, 1 to -4, 0 to -4, -1 to -3, -2 to -2, -2 to -1, -1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
