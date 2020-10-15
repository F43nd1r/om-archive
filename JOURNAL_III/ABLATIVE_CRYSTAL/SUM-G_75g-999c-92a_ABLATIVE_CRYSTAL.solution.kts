
solution {
    puzzle = "P068"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = -3 to 2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -6 to 4
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to 5
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -6 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
