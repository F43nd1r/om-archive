
solution {
    puzzle = "P058"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 2
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = -4 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                reset()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
