
solution {
    puzzle = "P069"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 10
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 2 to -1
        rotation = 7
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 9
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -2
        rotation = 9
    }
    io(OUTPUT) {
        index = 2
        position = 4 to -2
        rotation = 14
    }
    io(OUTPUT) {
        index = 3
        position = 4 to -2
        rotation = 8
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
