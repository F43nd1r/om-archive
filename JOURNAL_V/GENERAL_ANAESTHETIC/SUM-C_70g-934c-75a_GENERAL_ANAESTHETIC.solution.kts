
solution {
    puzzle = "P086"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(ANIMISMUS) {
        position = -1 to 3
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                forward()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                back()
                reset()
            }
        }
        )
    }
}
