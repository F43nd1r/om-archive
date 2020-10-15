
solution {
    puzzle = "P084"
    name = "B GG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 7 to 5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 6 to 4
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 8 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 8 to 4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to 5
        rotation = 0
    }
    track {
        position = 6 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(27)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(23)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(48)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
