
solution {
    puzzle = "P084"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = 7 to 4
        rotation = 10
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 9 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 5 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 8 to 1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 8 to 5
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 4
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 10 to 3
        rotation = 0
    }
    track {
        position = 7 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                extendTape()
                wait(43)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(6)
                rotateClockwise()
                rotateClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(18)
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
