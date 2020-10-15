
solution {
    puzzle = "P078"
    name = "B GIX"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = 0 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 3
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = 2 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = -4 to 1
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
