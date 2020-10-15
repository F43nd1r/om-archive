
solution {
    puzzle = "P054"
    name = "B GA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 3
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 3
        rotation = 0
    }
    track {
        position = 0 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                rotateClockwise()
                wait(5)
                rotateClockwise()
                wait(12)
                rotateClockwise()
                wait(12)
                rotateClockwise()
                wait(12)
                rotateClockwise()
                wait(12)
                rotateClockwise()
                wait(15)
                rotateClockwise()
                wait(10)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
