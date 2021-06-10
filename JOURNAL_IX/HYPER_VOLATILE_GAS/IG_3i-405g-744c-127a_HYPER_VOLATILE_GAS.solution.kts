
solution {
    puzzle = "P106"
    name = "3I"
    arm(ARM1) {
        number = 1
        position = -4 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 1
        rotation = -4
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 7 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to -4
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -6
        rotation = -2
    }
    track {
        position = -4 to -2
        positions = listOf(7 to -3, 6 to -3, 5 to -3, 4 to -3, 3 to -3, 2 to -3, 1 to -3, 0 to -2, -1 to -1, -1 to 0, 0 to 0, 0 to 1, -1 to 2, -2 to 2, -3 to 3, -4 to 4, -4 to 5, -3 to 5, -3 to 6, -3 to 7, -2 to 7, -1 to 7, -1 to 6, -2 to 6, -2 to 5, -2 to 4, -1 to 3, -1 to 4, -1 to 5, 0 to 5, 1 to 4, 1 to 5, 1 to 6, 2 to 6, 2 to 5, 3 to 4, 4 to 3, 5 to 2, 5 to 1, 5 to 0, 6 to 0, 7 to -1, 7 to -2)
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
