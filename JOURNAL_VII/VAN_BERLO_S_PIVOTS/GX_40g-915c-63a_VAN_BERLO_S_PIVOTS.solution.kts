
solution {
    puzzle = "P096"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -4
        rotation = -5
    }
    io(OUTPUT) {
        index = 2
        position = -1 to -4
        rotation = -5
    }
    io(OUTPUT) {
        index = 3
        position = -2 to 2
        rotation = 1
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
