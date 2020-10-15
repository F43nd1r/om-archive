
solution {
    puzzle = "P074"
    name = "B GI 1-2T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -2
        rotation = 2
    }
    glyph(DISPOSAL) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
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
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                forward()
                pivotClockwise()
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
                pivotClockwise()
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
