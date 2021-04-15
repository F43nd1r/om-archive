
solution {
    puzzle = "P087"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
