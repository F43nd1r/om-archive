
solution {
    puzzle = "w1611998067"
    name = "I"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 3
        rotation = 2
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -1 to -1, 0 to -1, 0 to -2, -1 to -2, -2 to -1, -3 to 0, -4 to 1, -4 to 2, -4 to 3, -4 to 4, -3 to 3, -2 to 2, -1 to 1)
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
