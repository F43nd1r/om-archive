
solution {
    puzzle = "P084"
    name = "G"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 9 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 7 to 4
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 6 to 3
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = 8 to 1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 8 to 5
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 4
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 10 to 3
        rotation = 0
    }
    track {
        position = 7 to 4
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(25)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(18)
                rotateClockwise()
                rotateClockwise()
                wait(6)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                rotateCounterClockwise()
                wait(16)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                back()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
