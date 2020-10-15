
solution {
    puzzle = "P026"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = -4 to 3
        rotation = 8
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to 3
        rotation = 6
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -5 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 4
        rotation = 0
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(4)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
