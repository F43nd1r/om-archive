
solution {
    puzzle = "P012"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -3 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(-1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
