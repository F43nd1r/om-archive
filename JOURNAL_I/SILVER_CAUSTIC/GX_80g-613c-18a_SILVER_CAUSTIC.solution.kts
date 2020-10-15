
solution {
    puzzle = "P057"
    name = "B AGX"
    arm(PISTON) {
        number = 1
        position = 4 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 5 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to 1
        rotation = -9
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -12
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
