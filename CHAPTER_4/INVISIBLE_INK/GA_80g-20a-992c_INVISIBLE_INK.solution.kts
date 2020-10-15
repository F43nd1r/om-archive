
solution {
    puzzle = "P032"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to 2
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 1
        rotation = 4
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                forward()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                back()
                forward()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                forward()
                pivotClockwise()
                forward()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
