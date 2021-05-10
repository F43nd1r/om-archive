
solution {
    puzzle = "P022"
    name = "INSTRUCTIONS 13"
    arm(ARM6) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 6 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 5
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 1, -5 to 2, -5 to 3, -5 to 4, -5 to 5, -5 to 6, -5 to 7, -4 to 7, -3 to 6, -2 to 5, -1 to 5, 0 to 5, 1 to 5, 2 to 5, 2 to 4, 3 to 3, 4 to 2, 5 to 1, 6 to 0, 6 to -1, 6 to -2, 5 to -2, 5 to -3, 4 to -3, 3 to -2, 2 to -1, 1 to -1)
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
