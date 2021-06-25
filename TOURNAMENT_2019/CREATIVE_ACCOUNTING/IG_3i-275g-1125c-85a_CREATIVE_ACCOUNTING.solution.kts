
solution {
    puzzle = "w1698785633"
    name = "B I3 G"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = -5
        size = 1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -3 to -3
        rotation = -6
    }
    glyph(PROJECTION) {
        position = -1 to -4
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -8 to 1
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(-1 to 1, -1 to 0, -1 to -1, -1 to -2, -1 to -3, -2 to -3, -2 to -2, -2 to -1, -3 to 0, -4 to 0, -5 to 0, -6 to 0, -7 to 0, -7 to -1, -7 to -2, -6 to -3, -5 to -3, -4 to -4, -3 to -5, -2 to -6, -1 to -6, 0 to -6, 0 to -5, -1 to -4, 0 to -4, 1 to -4, 2 to -4, 2 to -3, 2 to -2, 1 to -1, 0 to 0)
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
