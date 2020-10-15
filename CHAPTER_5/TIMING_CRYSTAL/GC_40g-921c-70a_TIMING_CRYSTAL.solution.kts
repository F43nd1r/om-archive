
solution {
    puzzle = "P042"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 3 to -4
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -4
        rotation = 0
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
