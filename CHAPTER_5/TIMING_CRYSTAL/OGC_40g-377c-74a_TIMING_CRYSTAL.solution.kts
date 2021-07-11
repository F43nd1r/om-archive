
solution {
    puzzle = "P042"
    name = "OVERLAP GC"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 4
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
