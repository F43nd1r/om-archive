
solution {
    puzzle = "P042"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
