
solution {
    puzzle = "w1698788220"
    name = "3I"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 1 to -3
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -8
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(-1 to 1, -2 to 2, -3 to 2, -3 to 3, -2 to 3, -1 to 3, 0 to 2, 1 to 1, 2 to 1, 3 to 1, 3 to 2, 2 to 3, 2 to 2, 1 to 3, 0 to 4, -1 to 4, -2 to 4, -3 to 4, -4 to 4, -4 to 3, -4 to 2, -4 to 1, -3 to 1, -2 to 1, -1 to 0)
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
