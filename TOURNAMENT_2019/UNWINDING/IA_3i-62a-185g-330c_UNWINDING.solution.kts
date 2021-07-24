
solution {
    puzzle = "w1611998067"
    name = "B I3A"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -6
        rotation = -1
    }
    track {
        position = -1 to 2
        positions = listOf(1 to -1, 2 to -2, 3 to -3, 2 to -3, 1 to -3, 1 to -4, 0 to -3, 0 to -2, -1 to -2, -2 to -2, -2 to -3, -2 to -4, -3 to -3, -4 to -2, -4 to -1, -3 to -1, -2 to -1, -1 to -1, 0 to -1)
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
