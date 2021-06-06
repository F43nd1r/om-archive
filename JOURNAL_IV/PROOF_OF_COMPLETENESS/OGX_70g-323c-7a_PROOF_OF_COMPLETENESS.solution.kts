
solution {
    puzzle = "P069"
    name = "OAG/OGA"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -2
        rotation = -1
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
