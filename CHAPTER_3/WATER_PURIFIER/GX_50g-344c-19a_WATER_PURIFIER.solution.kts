
solution {
    puzzle = "P025"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
