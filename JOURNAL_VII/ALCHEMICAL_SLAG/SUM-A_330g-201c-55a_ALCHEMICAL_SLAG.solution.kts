
solution {
    puzzle = "P099"
    name = "BOOPER BEAST 586 + 89"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -5 to 3
        rotation = 12
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = 15
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -7 to 0
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 0
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to -2
        rotation = 14
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -2 to 2
        rotation = 10
        size = 1
    }
    arm(ARM2) {
        number = 7
        position = -2 to 0
        rotation = 14
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to -2
        rotation = 13
        size = 1
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = 10
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 14
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 11
    }
    glyph(DUPLICATION) {
        position = -4 to 3
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = -5 to 2
        rotation = 10
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 9
    }
    glyph(PURIFICATION) {
        position = -4 to -1
        rotation = 11
    }
    glyph(UNIFICATION) {
        position = -3 to 1
        rotation = 11
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 12
    }
    io(INPUT) {
        index = 1
        position = -5 to -2
        rotation = 12
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -7 to 2
        rotation = 5
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(8)
                rotateClockwise()
                wait(6)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
            }
        }
        )
    }
}
