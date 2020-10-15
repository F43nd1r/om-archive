
solution {
    puzzle = "P074"
    name = "B GCX"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -4
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = -6
    }
    glyph(ANIMISMUS) {
        position = -1 to -2
        rotation = -4
    }
    glyph(DISPOSAL) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = -6
    }
    track {
        position = -2 to 0
        positions = listOf(1 to 0, 0 to 0, 0 to 1, 1 to 1)
    }
    conduit {
        id = 100
        position = 4 to -2
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to 2
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                back()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
