
solution {
    puzzle = "P032"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 1 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 5 to -2
        rotation = -2
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                drop()
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
