
solution {
    puzzle = "P099"
    name = "BOOPER BEAST 586 + 89 (Copy) (Copy) (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to 3
        rotation = 12
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 12
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 0
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -6 to 2
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 7
        position = -4 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -5 to -1
        rotation = 2
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 14
    }
    glyph(UNBONDER) {
        position = -7 to 3
        rotation = 10
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = -3
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -5 to 3
        rotation = 9
    }
    glyph(PROJECTION) {
        position = -4 to -1
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = -1 to -2
        rotation = 13
    }
    glyph(UNIFICATION) {
        position = -4 to 1
        rotation = 10
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 11
    }
    io(INPUT) {
        index = 2
        position = -1 to 2
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(8)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
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
                drop()
                rotateClockwise()
                rotateClockwise()
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
            sequence(1) {
                wait(8)
                rotateCounterClockwise()
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(11)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(14)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                reset()
            }
        }
        )
    }
}
