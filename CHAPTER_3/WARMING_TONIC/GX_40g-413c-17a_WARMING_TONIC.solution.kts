
solution {
    puzzle = "P028"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
