
solution {
    puzzle = "P054"
    name = "B AG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(25)
                rotateCounterClockwise()
                wait(8)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                wait(9)
                reset()
            }
        }
        )
    }
}
